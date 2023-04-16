/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Credit Aldo
 */
package crud_lat;

public class CRUD_Lat {
    public static void main(String[] args) {
        try {
            Form_Siswa form = new Form_Siswa();
            form.setVisible(true);
        } catch (Exception ex) {
            System.err.println(ex.toString());
        }
    }
    
}
