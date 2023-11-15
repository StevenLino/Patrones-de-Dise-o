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
public class Main {
    public static void main(String[] args) {
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDocument = pdfFactory.createDocument();
        pdfDocument.create();

        DocumentFactory textFactory = new TextDocumentFactory();
        Document textDocument = textFactory.createDocument();
        textDocument.create();
    }
}
