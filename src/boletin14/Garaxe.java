
package boletin14;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Garaxe {
    Scanner sc=new Scanner(System.in);
    private int nCoches;
    private int matricula;
    private float tiempo;
    private long tiempoE;
    private long tiempoS;
    private float precio;
    private float cantPagar;
    float cantDevuelta;
    
    public void calcularPlazas(){
        System.out.println("Número coche :");
        nCoches=sc.nextInt();
        if(nCoches>0 && nCoches<6){
            System.out.println("* HAI PLAZAS DISPONIBLES *");
            tiempoE=System.currentTimeMillis();
            System.out.println("Agregar a matrícula : ");
            matricula=sc.nextInt();
        }else{
            System.out.println("\n---------------------\n* PARKING COMPLETO *\n---------------------\n");
        }
    }
    
    public long tiempoSalidaParking(){
        tiempoS=System.currentTimeMillis();
        nCoches--;
        return tiempoS;
    }
    
    public float tiempoTotalParking(){
        tiempo=(tiempoS-tiempoE)/1000;
        return tiempo;
    }
    
    public float pagarParking(){
        precio=(((tiempo/3)*1.5f)*0.20f);
        return precio;
    }
    
    public void mostratFactura(){
        tiempoSalidaParking();
        this.tiempoTotalParking();
        this.pagarParking();
        System.out.println("Tempo total : "+tiempoTotalParking());
        System.out.println("Prezo a pagar : "+pagarParking()+" Introduce o diñeiro : ");
        cantPagar=sc.nextFloat();
        if(cantPagar>pagarParking()){
            cantDevuelta=cantPagar-pagarParking();
            System.out.println("CANTIDADE INTRODUCIDA : "+cantPagar+"\nCantidade devolta : "+cantDevuelta);
        }else{
            System.out.println("* DIÑEIRO INTRODUCIDO : "+cantPagar+" *");
        }
        System.out.println("FACTURA\nMatrícula coche : "+matricula+"\nTempo total : "+tiempoTotalParking()+"\nPrezo : "+pagarParking()+" € \nDiñeiro recibido : "+cantDevuelta+"\n\n¡ GRAZAS POR USAR NOSO APARCADOIRO !\n\n");
    }
}
