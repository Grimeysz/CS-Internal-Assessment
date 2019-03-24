/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerscienceinternalassessment;

import java.awt.Color; //right now I am not using the myColor class
import java.util.Date;


/**
 *
 * @author 14914
 */
public class Palette {
    private String paletteName = "not set yet";
    private String paletteDescription = "not set yet";
    private boolean forWork = false;
    private int colorsQuantity = -999;
    private Color [] colors; //is this how it works? 
    
   
    //how to use date class? 
    //myColor class needs working
    
    public Palette(){
        
    }
    
    public Palette(String paletteName, String paletteDescription, boolean forWork, int colorsQuantity, Color [] color){
        //super for color? bc it has a constructor
        
        this.paletteName = paletteName;
        this.paletteDescription = paletteDescription;
        this.forWork = forWork;
        this.colorsQuantity = colorsQuantity;
        this.colors = colors; //this will now be in a separate class.
     
        
              
    }
    
    public String getPaletteName(){
        return paletteName;
    }
    
    public String getPaletteDescription(){
        return paletteDescription;
    }
    
    public boolean getForWork(){
        return forWork;
    }
    
    public int getColorsQuantity(){
        return colorsQuantity;
    }
    
    public Color [] getColors(){
        return colors;
    }
    
    
    
  
    
    public void setPaletteName(){
        this.paletteName = paletteName;
    }
    
    public void setPaletteDescription(){
        this.paletteDescription = paletteDescription;
    }
    
    public void setForWork(){
        this.forWork = forWork;
    }
    
    public void setColorsQuantity(){
        this.colorsQuantity = colorsQuantity;
    }
    
    public void setColors(){
        this.colors = colors;
    }
    
   
  

}



