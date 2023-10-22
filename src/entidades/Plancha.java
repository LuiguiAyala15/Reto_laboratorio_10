/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author USER
 */
public class Plancha extends Electrodomestico
        implements Aparatos {

    private String marc;
    private String tip;
    private String tipop;

   
   

    @Override
    public String getNombre() {
         String tipoText;
        if (null == tipop) {
            tipoText = "Tipo desconocido";
        } else switch (tipop) {
            case "Domestico":
                tipoText = "Domestico";
                break;
            case "Industrial":
                tipoText = "Industrial";
                break;
            default:
                tipoText = "Tipo desconocido";
                break;
        }
        
        
        return "Marca de la plancha: " + marc + "  //  Serial: " + tip + "  //  Tipo: " + tipoText;
    }

    /**
     * @return the color
     */
    public String getMarc() {
        return marc;
    }

    /**
     * @param color the color to set
     */
    public void setMarc(String nom) {
        this.marc = nom;
    }

    /**
     * @return the precio
     */
    public String getTip() {
        return tip;
    }

    /**
     * @param precio the precio to set
     */
    public void setTip(String tip) {
        this.tip = tip;
    }
    
    public String getTipop() {
        return tipop;
    }

    public void setTipop(String tipop) {
        this.tipop = tipop;
    }
    @Override
    public void vestir() {

    }
}
