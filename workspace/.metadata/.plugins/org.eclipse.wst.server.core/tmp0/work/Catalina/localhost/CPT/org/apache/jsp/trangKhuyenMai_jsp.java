/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-05-07 17:06:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class trangKhuyenMai_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/all/css.jsp", Long.valueOf(1715054731843L));
    _jspx_dependants.put("/all/homeFooter.jsp", Long.valueOf(1715101575554L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js\" ></script>\r\n");
      out.write("<link href=\"https://getbootstrap.com/docs/5.3/assets/css/docs.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"all/style.css\">");
      out.write("\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "all/homeHeader.jsp", out, false);
      out.write("\r\n");
      out.write("<h1>ádfghjk</h1>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<footer class=\"text-center text-lg-start bg-body-tertiary text-muted\">\r\n");
      out.write("		<section\r\n");
      out.write("			class=\"d-flex justify-content-center justify-content-lg-between p-4 border-bottom\">\r\n");
      out.write("			<div class=\"me-5 d-none d-lg-block\">\r\n");
      out.write("				<span>Kết nối với chúng tôi:</span>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div>\r\n");
      out.write("				<a href=\"https://www.facebook.com/chinh.tong.587\"\r\n");
      out.write("					class=\"me-4 text-reset\"> <i class=\"fab fa-facebook-f\"></i>\r\n");
      out.write("				</a> <a href=\"\" class=\"me-4 text-reset\"> <i class=\"fab fa-twitter\"></i>\r\n");
      out.write("				</a> <a href=\"\" class=\"me-4 text-reset\"> <i class=\"fab fa-google\"></i>\r\n");
      out.write("				</a> <a href=\"\" class=\"me-4 text-reset\"> <i class=\"fab fa-instagram\"></i>\r\n");
      out.write("				</a> <a href=\"\" class=\"me-4 text-reset\"> <i class=\"fab fa-linkedin\"></i>\r\n");
      out.write("				</a> <a href=\"\" class=\"me-4 text-reset\"> <i class=\"fab fa-github\"></i>\r\n");
      out.write("				</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("		<section class=\"\">\r\n");
      out.write("			<div class=\"container text-center text-md-start mt-5\">\r\n");
      out.write("				<div class=\"row mt-3\">\r\n");
      out.write("					<div class=\"col-md-2 col-lg-4 col-xl-3 mx-auto mb-4\">\r\n");
      out.write("						<h6 class=\"text-uppercase fw-bold mb-4\">\r\n");
      out.write("							<i class=\"fas fa-gem me-3\"></i>Laptop-Store.vn\r\n");
      out.write("						</h6>\r\n");
      out.write("						<p>Uy tín tạo lên thương hiệu</p>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto mb-4\">\r\n");
      out.write("						<!-- Links -->\r\n");
      out.write("						<h6 class=\"text-uppercase fw-bold mb-4\">Menu</h6>\r\n");
      out.write("						<p>\r\n");
      out.write("							<a href=\"index.jsp\" class=\"text-reset\">Trang chủ</a>\r\n");
      out.write("						</p>\r\n");
      out.write("						<p>\r\n");
      out.write("							<a href=\"trangGioiThieu.jsp\" class=\"text-reset\">Giới thiệu</a>\r\n");
      out.write("						</p>\r\n");
      out.write("						<p>\r\n");
      out.write("							<a href=\"trangTinTuc.jsp\" class=\"text-reset\">Tin tức</a>\r\n");
      out.write("						</p>\r\n");
      out.write("						<p>\r\n");
      out.write("							<a href=\"trangKhuyenMai.jsp\" class=\"text-reset\">Khuyến mãi</a>\r\n");
      out.write("						</p>\r\n");
      out.write("						<p>\r\n");
      out.write("							<a href=\"trangLienHe.jsp\" class=\"text-reset\">Liên hệ</a>\r\n");
      out.write("						</p>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto mb-4\">\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<h6 class=\"text-uppercase fw-bold mb-4\">Sản phẩm laptop</h6>\r\n");
      out.write("							<div class=\"col-md-2\">\r\n");
      out.write("								<p>\r\n");
      out.write("									<a href=\"lapacer.jsp\" class=\"text-reset\">Acer</a>\r\n");
      out.write("								</p>\r\n");
      out.write("								<p>\r\n");
      out.write("									<a href=\"lapdell.jsp\" class=\"text-reset\">Dell</a>\r\n");
      out.write("								</p>\r\n");
      out.write("								<p>\r\n");
      out.write("									<a href=\"laplenovo.jsp\" class=\"text-reset\">Lenovo</a>\r\n");
      out.write("								</p>\r\n");
      out.write("								<p>\r\n");
      out.write("									<a href=\"lapasus.jsp\" class=\"text-reset\">Asus</a>\r\n");
      out.write("								</p>\r\n");
      out.write("								<p>\r\n");
      out.write("									<a href=\"lapapple.jsp\" class=\"text-reset\">Apple</a>\r\n");
      out.write("								</p>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"col-md-2 mx-5\">\r\n");
      out.write("								<p>\r\n");
      out.write("									<a href=\"laphp.jsp\" class=\"text-reset\">Hp</a>\r\n");
      out.write("								</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto mb-4\">\r\n");
      out.write("						<!-- Links -->\r\n");
      out.write("						<h6 class=\"text-uppercase fw-bold mb-4\">Sản phẩm khác</h6>\r\n");
      out.write("						<p>\r\n");
      out.write("							<a href=\"linkkien.jsp\" class=\"text-reset\">Các sản phẩm khác</a>\r\n");
      out.write("						</p>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-2 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4\">\r\n");
      out.write("						<h6 class=\"text-uppercase fw-bold mb-4\">Liên hệ</h6>\r\n");
      out.write("						<p>\r\n");
      out.write("							<i class=\"fas fa-home me-3\"></i> HUTU, 2030 ASRT, VN\r\n");
      out.write("						</p>\r\n");
      out.write("						<p>\r\n");
      out.write("							<i class=\"fas fa-envelope me-3\"></i> TONGCHINH@gmail.com\r\n");
      out.write("						</p>\r\n");
      out.write("						<p>\r\n");
      out.write("							<i class=\"fas fa-phone me-3\"></i> + 01 234 567 89\r\n");
      out.write("						</p>\r\n");
      out.write("						<p>\r\n");
      out.write("							<i class=\"fas fa-print me-3\"></i> + 01 234 567 89\r\n");
      out.write("						</p>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("		<div class=\"text-center p-4\"\r\n");
      out.write("			style=\"background-color: rgba(0, 0, 0, 0.05);\">\r\n");
      out.write("			© 2024 Computer Caro: <a class=\"text-reset fw-bold\"\r\n");
      out.write("				href=\"https://docs.google.com/document/d/1mygQ8ZYOb9cEwQTx0xBLZqgMztIo64HYiAF25eEf7bY/edit\">ComputerCaro.com</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
