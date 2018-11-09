package pl.coderslab.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //System.out.println("FILTER IN");

        //zeby dostac sie do sesji musimy castowac
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        Boolean loggedIn = (Boolean) httpServletRequest.getSession(true).getAttribute("loggedIn");

        if (loggedIn != null && loggedIn == true) {
            filterChain.doFilter(servletRequest, servletResponse); // to pozwalamy isc dalej
        } else {
            httpServletResponse.sendRedirect("/login");
        }


        //System.out.println("FILTER OUT");

    }

    @Override
    public void destroy() {

    }
}
