package frontEnd.contador;
import frontEnd.cronometro.GuiCronometroQuarto07;  
import javax.swing.JLabel;  
      
    public class ContadorQuarto07 extends Thread {  
      
        private JLabel hr;  
      
        public ContadorQuarto07(JLabel hora) {  
            this.hr = hora;  
        }  
      
        @Override  
        public void run() {  
           try {  
               int segundo = 0;  
               int hora = 0;  
               int minuto = 0;  
               while( true ) {  
                   Thread.sleep(1000);  
                   if( GuiCronometroQuarto07.isContador() ) {  
                       if( GuiCronometroQuarto07.isZerado() ) {  
                           segundo = 0;  
                           hora = 0;  
                           minuto = 0;  
                           GuiCronometroQuarto07.setZerado(false);  
                       }  
                       segundo++;  
                         
                       if( segundo > 59 ){  
                           segundo = 00;  
                           minuto = minuto+1;  
                       }  
          
                       if( minuto == 59 ){  
                           minuto = 00;  
                           hora = hora+1;  
                       }  
                         
                       String timer = completaComZero(hora) + ":" +  
                                      completaComZero(minuto) + ":" +  
                                      completaComZero(segundo);  
                       this.hr.setText(timer);  
                       this.hr.revalidate();  
                   }  
               }  
           } catch (InterruptedException ex) {  
               ex.printStackTrace();  
           }  
        }  
      
        private String completaComZero(Integer i) {  
            String retorno = null;  
            if( i < 10 ) {  
                retorno = "0"+i;  
            } else {  
                retorno = i.toString();  
            }  
            return retorno;  
        }  
      
    }  