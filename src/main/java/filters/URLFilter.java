package main.java.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;


@WebFilter("/URLFilter")
public class URLFilter implements Filter {

    private static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
    private static final String ENCODING_DEFAULT = "UTF-8";
    private static final String ENCODING_INIT_PARAM_NAME = "encoding";

    private String encoding;

    /**
     * Default constructor.
     */
    public URLFilter() {
    }

    /**
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
     */
    public void init(FilterConfig fConfig) throws ServletException {
        encoding = fConfig.getInitParameter(ENCODING_INIT_PARAM_NAME);
        if (encoding == null)
            encoding = ENCODING_DEFAULT;
    }

    /**
     * @see javax.servlet.Filter#destroy()
     */
    public void destroy() {
    }

    /**
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
            ServletException {

        if (!(request instanceof HttpServletRequest)) {
            chain.doFilter(request, response);
            return;
        }

        HttpServletResponse httpResponse = (HttpServletResponse) response;

        HttpServletResponseWrapper wrappedResponse = new HttpServletResponseWrapper(httpResponse) {
            public String encodeRedirectUrl(String url) {
                return url;
            }

            public String encodeRedirectURL(String url) {
                return url;
            }

            public String encodeUrl(String url) {
                return url;
            }

            public String encodeURL(String url) {
                return url;
            }
        };

        String contentType = request.getContentType();
        if (contentType != null && contentType.startsWith(CONTENT_TYPE))
            request.setCharacterEncoding(encoding);

        chain.doFilter(request, wrappedResponse);
    }
}
