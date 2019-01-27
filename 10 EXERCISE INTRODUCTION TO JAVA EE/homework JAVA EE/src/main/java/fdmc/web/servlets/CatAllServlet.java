package fdmc.web.servlets;

import fdmc.domain.entities.Cat;
import fdmc.util.HtmlReader;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class CatAllServlet extends HttpServlet {

    private final static String ALL_CATS_HTML_FILE_PATH =
            "C:\\OneDrive\\Java\\Java WEB\\Java Web Development Basics\\10 EXERCISE INTRODUCTION TO JAVA EE\\homework JAVA EE\\src\\main\\resources\\views\\cat-all.html";

    private final HtmlReader htmlReader;

    @Inject
    public CatAllServlet(HtmlReader htmlReader) {
        this.htmlReader = htmlReader;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String debug = "";
        String htmlFileContent = this.htmlReader.readHtmlFile(ALL_CATS_HTML_FILE_PATH);

        if (req.getSession().getAttribute("cats") == null) {
            htmlFileContent = htmlFileContent
                    .replace("{{allCats}}", "There are no cats. <a href=\"/cats/create\">Create Some!</a>");
        } else {
            StringBuilder sb = new StringBuilder();
            ((Map<String, Cat>) req.getSession().getAttribute("cats"))
                    .values()
                    .stream()
                    .forEach(cat -> {
                        sb.append(String.format("<a href=\"/cats/profile?catName=%s\">%s</a><br /><br />", cat.getName(), cat.getName()));
                    });

            htmlFileContent = htmlFileContent.replace("{{allCats}}", sb.toString().trim());
        }

        resp.getWriter().println(htmlFileContent);
    }
}
