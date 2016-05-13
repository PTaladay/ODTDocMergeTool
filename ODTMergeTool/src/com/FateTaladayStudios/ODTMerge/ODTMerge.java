package com.FateTaladayStudios.ODTMerge;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.doc.OdfDocument;
import org.odftoolkit.odfdom.doc.OdfTextDocument;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
public class ODTMerge {
    static OdfTextDocument outputOdt;
    public static void Merge(String primaryDocFileName, String secondaryDocFileName){
    try
    {
    	OdfTextDocument primaryDoc = (OdfTextDocument) OdfDocument.loadDocument ( primaryDocFileName);
    	OdfTextDocument secondaryDoc = (OdfTextDocument) OdfDocument.loadDocument ( secondaryDocFileName);
    	
    	OdfFileDom secondaryContentDom = secondaryDoc.getContentDom();
    	OdfFileDom secondaryStyleDom = secondaryDoc.getStylesDom();
    	
    	secondaryContentDom.
        outputOdt.save("quick.odt");
    }
    catch (Exception e)
    {
        System.err.println("Unable to create output file.");
        System.err.println(e.getMessage());
    }
    }
   
}
