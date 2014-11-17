package Controlador;

import Modelo.Pokemon;
import Vista.VistaCombateUvsCpu;

public class ControladorCombateCpu {
    public ControladorPrincipal cp;
    public ControladorCombate cc;
    public ControladorCombateCpu cpu; 
    public VistaCombateUvsCpu vcpu;
    public int pCambio = 0;
    
    // método que determina la acción a ser realizada por la cpu
    public Pokemon[] accionCpu(Pokemon[] listaCpu, Pokemon[] listaHumano){
        if(listaCpu[0].getPS() > (listaCpu[0].getPS()/3)){
            accionOfensiva(listaCpu, listaHumano);
        }
        else if(listaCpu[0].getPS() < (listaCpu[0].getPS()/3)){
            accionDefensiva(listaCpu, listaHumano);
        }
        else if(listaCpu[0].getPS() == 0){
            cc.cambiaDebil(listaCpu);
        }
        return listaCpu;
    }
    
    
    // método que determina la acción ofensiva de la cpu
    public void accionOfensiva(Pokemon[] listaCpu, Pokemon[] listaRival){
        if(listaCpu[0].getAtk() > listaCpu[0].getAtkEsp()){
            cc.atacar(true, listaRival[0].getPS(), listaCpu[0].getAtk(), listaCpu[0].getAtkEsp(), listaCpu[0].getDef(), listaCpu[0].getDefEsp(), listaCpu);
        }
        else if(listaCpu[0].getAtk() < listaCpu[0].getAtkEsp()){
            cc.atacar(false, listaRival[0].getPS(), listaCpu[0].getAtk(), listaCpu[0].getAtkEsp(), listaCpu[0].getDef(), listaCpu[0].getDefEsp(), listaCpu);
        }
    }
    
    
    // método que determina la acción defensiva de la cpu
    public void accionDefensiva(Pokemon[] listaCpu, Pokemon[] listaRival){
        if(listaCpu[0].getDef() >= listaRival[0].getAtk() && listaCpu[0].getDefEsp() >= listaRival[0].getAtkEsp()){
            accionOfensiva(listaCpu, listaRival);
        }
        else if(listaCpu[0].getDef() < listaRival[0].getAtk() && listaCpu[0].getDefEsp() >= listaRival[0].getAtkEsp()){
            for(int i = 0; i < listaCpu.length; i++){
                if(listaCpu[0].getDef() < listaCpu[i].getDef()){
                    pCambio = i;
                    cc.cambio(listaCpu, pCambio);
                }
                break;
            }
        }
        else if(listaCpu[0].getDef() >= listaRival[0].getAtk() && listaCpu[0].getDefEsp() < listaRival[0].getAtkEsp()){
            for(int i = 0; i < listaCpu.length; i++){
                if(listaCpu[0].getDefEsp()< listaCpu[i].getDefEsp()){
                    pCambio = i;
                    cc.cambio(listaCpu, pCambio);
                }
                break;
            }
        }
        else if(listaCpu[0].getDef() < listaRival[0].getAtk() && listaCpu[0].getDefEsp() < listaRival[0].getAtkEsp()){
            for(int i = 0; i < listaCpu.length; i++){
                if(listaCpu[0].getDef() < listaCpu[i].getDef() || listaCpu[0].getDefEsp()< listaCpu[i].getDefEsp()){
                    pCambio = i;
                    cc.cambio(listaCpu, pCambio);
                }
                break;
            }
        }
        
    }
    
}