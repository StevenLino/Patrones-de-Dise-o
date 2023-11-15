/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

/**
 *
 * @author USUARIO
 */
public class PdfDocument implements Document{
     @Override
    public void create() {
        System.out.println("PDF Document created.");
    }
}
