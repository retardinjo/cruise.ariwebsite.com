package servlets;

import database.DBQueries;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Reservation;

@WebServlet(name = "VoucherServlet", urlPatterns = {"/VoucherServlet"})
public class VoucherServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            int reservation_id = Integer.parseInt(request.getParameter("reservationId"));
            int voucherInvoiceBill = Integer.parseInt(request.getParameter("voucherInvoiceBill"));
            
            //out.print("reservation_id" + reservation_id);

            request.getSession().setAttribute("reservation_id", reservation_id);
            //Reservation r = DBQueries.getReservationById(reservation_id);
            
           // String atype = r.getActivity().getType();
            //out.print(atype);
            if(voucherInvoiceBill == 1){
            response.sendRedirect("voucher.jsp");
            }
            if(voucherInvoiceBill == 2){
            response.sendRedirect("invoice.jsp");
            }
            if(voucherInvoiceBill == 3){
            response.sendRedirect("bill.jsp");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
