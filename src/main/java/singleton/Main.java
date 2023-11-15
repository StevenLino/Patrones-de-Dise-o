
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("This is a log message.");

        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("Another log message.");
    }
}
