package java100.app.control;

import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import java100.app.annotation.Component;
import java100.app.dao.mysql.RoomDaoImpl;
import java100.app.domain.Room;

@Component("/room")
public class RoomController implements Controller {
    Scanner keyScan = new Scanner(System.in);
    RoomDaoImpl roomDaoImpl;

    public void setRoomDao(RoomDaoImpl roomDaoImpl) {
        this.roomDaoImpl = roomDaoImpl;
    }

    @Override
    public void destroy() {
    }

    @Override
    public void init() {
    }

    @Override
    public void execute(Request request, Response response) {
        switch (request.getMenuPath()) {
        case "/room/list":
            this.doList(request, response);
            break;
        case "/room/add":
            this.doAdd(request, response);
            break;
        case "/room/delete":
            this.doDelete(request, response);
            break;
        default:
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }

    private void doList(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[강의실 목록]");

        try {
            List<Room> list = roomDaoImpl.selectList();
            for (Room room : list) {
                out.printf("%d, %s, %s, %d\n", room.getNo(), room.getloc(),
                        room.getName(), room.getCapacity());
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage()); // for user
        }
    }

    private void doAdd(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[강의실 등록]");

        try {
            Room room = new Room();
            room.setloc(request.getParameter("loc"));
            room.setName(request.getParameter("name"));
            room.setCapacity(
                    Integer.parseInt(request.getParameter("capacity")));
            if (roomDaoImpl.insert(room) > 0)
                out.println("저장하였습니다.");
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }

    private void doDelete(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[강의실 삭제]");
        int no = Integer.parseInt(request.getParameter("no"));

        try {
            if (roomDaoImpl.delete(no) > 0)
                out.println("삭제하였습니다.");
            else
                out.printf("'%d'의 강의실 정보가 없습니다.\n", no);
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage()); // for user
        }
    }
}
