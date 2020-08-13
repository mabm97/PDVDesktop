/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.mor.chineloio.utils;

import java.net.URISyntaxException;
import java.net.URL;

/**
 *
 * @author MarcoABM
 */
public class PathResources {
    public static void main(String[] args) throws URISyntaxException {
        PathResources pathResources = new PathResources();
        System.out.println(pathResources.getJRXML());
    }
    public URL getQR() throws URISyntaxException {
        return getClass().getResource("qr.png");
    }

    public URL getLogo() throws URISyntaxException {
        return getClass().getResource("logo.png");
    }
    public URL getTitle() throws URISyntaxException {
        return getClass().getResource("title.png");
    }

    public URL getJRXML() throws URISyntaxException {
        return getClass().getResource("note.jrxml");
    }

    public String pathDiskC() {
        return System.getProperty("user.home").concat("\\NotasdeVenta");
    }

    public String pathProyecto() {
        return System.getProperty("user.dir");
    }

}
