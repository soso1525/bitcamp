package java100.app.control;

import java.io.PrintWriter;
import java.util.List;

import java100.app.annotation.Component;
import java100.app.dao.mysql.ScoreDaoImpl;
import java100.app.domain.Score;


@Component("/score")
public class ScoreController implements Controller {

    ScoreDaoImpl scoreDaoImpl;

    public void setScoreDao(ScoreDaoImpl scoreDaoImpl) {
        this.scoreDaoImpl = scoreDaoImpl;
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
        case "/score/add":
            this.doAdd(request, response);
            break;
        case "/score/list":
            this.doList(request, response);
            break;
        case "/score/view":
            this.doView(request, response);
            break;
        case "/score/update":
            this.doUpdate(request, response);
            break;
        case "/score/delete":
            this.doDelete(request, response);
            break;
        default:
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }

    private void doDelete(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[성적 삭제]");

        try {
            if (scoreDaoImpl
                    .delete(Integer.parseInt(request.getParameter("no"))) > 0)
                out.println("삭제하였습니다.");
            else
                out.printf("'%s'의 성적 정보가 없습니다.\n", request.getParameter("no"));
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }

    private void doUpdate(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[성적 변경]");

        try {
            Score score = new Score();
            score.setName(request.getParameter("name"));
            score.setKor(Integer.parseInt(request.getParameter("kor")));
            score.setEng(Integer.parseInt(request.getParameter("eng")));
            score.setMath(Integer.parseInt(request.getParameter("math")));
            score.setNo(Integer.parseInt(request.getParameter("no")));
            if (scoreDaoImpl.update(score) > 0)
                out.println("변경하였습니다.");
            else
                out.printf("'%s'의 성적 정보가 없습니다.\n", request.getParameter("no"));
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }

    private void doView(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[성적 상세 정보]");

        try {
            int no = Integer.parseInt(request.getParameter("no"));
            Score score = scoreDaoImpl.selectOne(no);

            if (score != null) {
                out.printf("번호: %d\n", score.getNo());
                out.printf("이름: %s\n", score.getName());
                out.printf("국어: %d\n", score.getKor());
                out.printf("영어: %d\n", score.getEng());
                out.printf("수학: %d\n", score.getMath());
                out.printf("합계: %d\n", score.getSum());
                out.printf("평균: %.1f\n", score.getAver());
            } else {
                out.printf("'%d'의 성적 정보가 없습니다.\n", no);
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }

    private void doList(Request request, Response response) {

        PrintWriter out = response.getWriter();
        out.println("[성적 목록]");

        try {
            List<Score> list = scoreDaoImpl.selectList();
            for (Score score : list) {
                out.printf("%4d, %-4s, %4d, %6.1f\n", score.getNo(),
                        score.getName(), score.getSum(), score.getAver());
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage()); // for user
        }
    }

    private void doAdd(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[성적 등록]");

        try {
            Score score = new Score();
            score.setName(request.getParameter("name"));
            score.setKor(Integer.parseInt(request.getParameter("kor")));
            score.setEng(Integer.parseInt(request.getParameter("eng")));
            score.setMath(Integer.parseInt(request.getParameter("math")));
            if (scoreDaoImpl.insert(score) > 0)
                out.println("저장하였습니다.");
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }
}
