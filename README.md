# Conversor de Divisas

![conversor de divisas](https://github.com/carmenRL17/ConversorMonedas/blob/main/src/img/conversor.png?raw=true)

<p align="left">
   <img src="http://img.shields.io/static/v1?label=STATUS&message=EN%20DESARROLLO&color=RED&style=for-the-badge" #vitrinedev/>
</p>


Desafío del Challenge Java Conversor de Divisas

<p>El desafío del Challenge Java!, un conversor de divisas utilizando el lenguaje Java.<p/>


## Herramientas utilizadas
<a href="https://www.java.com" target="_blank"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>

## Funcionalidades
`Entrada de valor:`Este cuadro de diálogo debe permitir al usuario ingresar el valor o la cantidad de dinero que desea convertir a la moneda escogida.

`Opciones de monedas:`El usuario debe seleccionar del ComboBox la moneda a convertir y la moneda final.

`Valor de la conversion:`Utilizando el método showMessageDialog se mostra  al usuário el valor de la conversión realizada.

`Manejo de errores:`Especificar que no deben permitirse otro tipo de caracteres que no sean números.

`Opcion: Desea continuar o finalizar programa:`El usuario debe decidir que hacer después de realizar la primera conversión, las siguientes opciones:

- Yes: Debe llevar nuevamente a nuestro usuario a menu principal para escoger una opción de conversión.
- No: Debe mostrar un mensaje de "Programa Finalizado"
- Cancelar: Debe mostrar un mensaje de "Programa Finalizado"

## Lineas de Codigo
```
btnCovertir.addActionListener((e)->{
            try{
                
                double valor = Double.parseDouble(tfCantidad.getText());
                String valorinicial = (String) combo1.getSelectedItem();
                String valorFinal = (String) combo2.getSelectedItem();
               Convertidor puenteConexion = new Convertidor();
               double resultadoFinal=puenteConexion.convertir(valor,valorinicial,valorFinal);
                lbResultado.setText("");
                JOptionPane.showMessageDialog(this,"El resultado es: "+resultadoFinal);
                
                int opc=JOptionPane.showConfirmDialog(this,"Desea continuar?");
                
                if(opc == 0){
                    tfCantidad.setText("");
                    lbResultado.setText("Ingrese de nuevo los datos...");
                }else if(opc == 1){
                    JOptionPane.showMessageDialog(this," Programa Finalizado");
                    System.exit(0);
                    
                }else{
                    JOptionPane.showMessageDialog(this," Programa Finalizado");
                    System.exit(0);
                    
                }


                }catch(Exception ex){
                    
                    JOptionPane.showMessageDialog(this, "Ingrese un Valor Numerico");
                }
        });
```


### Imagenes del programa.

Entrada de valor.

![conversor de divisas](https://github.com/carmenRL17/ConversorMonedas/blob/main/src/img/ventana1.png?raw=true)

Valor de la conversion.

![conversor de divisas](https://github.com/carmenRL17/ConversorMonedas/blob/main/src/img/ventana2.png?raw=true)

Opcion--> Desea continuar.

![conversor de divisas](https://github.com/carmenRL17/ConversorMonedas/blob/main/src/img/ventana3.png?raw=true)

Finalizar programa.

![conversor de divisas](https://github.com/carmenRL17/ConversorMonedas/blob/main/src/img/ventana4.png?raw=true)


