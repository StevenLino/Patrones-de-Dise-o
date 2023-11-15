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
public class TextDocumentFactory extends DocumentFactory {
    @Override
    Document createDocument() {
        return new TextDocument();
    }
}

