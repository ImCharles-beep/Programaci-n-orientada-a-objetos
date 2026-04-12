package poo.Ejercicio52;

class facturaSimple {

  int numero;
  String cliente;
  double valor;
  
  void aplicarDescuento(){
  this.valor = this.valor * 0.10; // Aplica un descuento del 10%
  }
}