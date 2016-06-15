// package com.sopra.germee.rest;
//
// import java.io.IOException;
//
// import javax.servlet.Filter;
// import javax.servlet.FilterChain;
// import javax.servlet.FilterConfig;
// import javax.servlet.ServletException;
// import javax.servlet.ServletRequest;
// import javax.servlet.ServletResponse;
// import javax.servlet.http.HttpServletResponse;
//
// import org.springframework.stereotype.Component;
//
/// ***Classe SimpleCORSFilter permettant de surcharger la reponse avec les entetes HTTP.**
//
// @author CNAMTS - DAIT/DDST
// */
// @Component
// public class CorsFilter implements Filter {
//
// /*
// * (non-Javadoc)
// *
// * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
// */
// @Override
// public void doFilter(final ServletRequest pServletRequest, final ServletResponse pServletResponse, final FilterChain pFilterChain)
// throws IOException, ServletException {
//
// HttpServletResponse response = (HttpServletResponse) pServletResponse;
// /// XXX: code review
// response.setHeader("Access-Control-Allow-Origin", "*");
// response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
// response.setHeader("Access-Control-Max-Age", "3600");
// response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
//
// pFilterChain.doFilter(pServletRequest, pServletResponse);
// }
//
// /*
// * (non-Javadoc)
// *
// * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
// */
// @Override
// public void init(final FilterConfig pFilterConfig) {}
//
// /*
// * (non-Javadoc)
// *
// * @see javax.servlet.Filter#destroy()
// */
// @Override
// public void destroy() {}
//
// }
