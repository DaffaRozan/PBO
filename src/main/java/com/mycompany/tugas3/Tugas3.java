/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas3;
import com.mycompany.tugas3.models.PasswordStore;

/**
 *
 * @author D2A
 */
public class Tugas3 {

    public static void main(String[] args) {
         try {
            PasswordStore pass1 = new PasswordStore("Akun BCA", "1122334455", "RahasiaNegara");
            pass1.setCategory(PasswordStore.CAT_WEBAPP);
            System.out.println(pass1);
            System.out.println("USERNAME: " + pass1.username + " PASSWORD: " + pass1.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
