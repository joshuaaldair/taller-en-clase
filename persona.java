package infper;

import java.util.Random;

public class Persona {
	//atributos
	private String	Nombre, cedula;
	private float	Peso, altura;
	private int 	 edad;
	private char	 sexo;
	
	//Constructores
	public Persona()
	{
		this.Nombre="";
		this.Edad=0;
		this.Cedula="";
		this.Sexo=' ';
		this.Peso=0;
		this.Altura=0;
	}
	
	public Persona(String Nombre, int Edad, char Sexo) 
	{
		this.Nombre=Nombre;
		this.Edad=Edad;
		this.Cedula="";
		this.Sexo=Sexo;
		this.Peso=0;
		this.Altura=0;
	}
	
	public Persona(String Nombre, int Edad, char Sexo, float Peso, float Altura) 
	{
		this.Nombre=Nombre;
		this.Edad=Edad;
		this.Cedula="";
		this.Sexo=Sexo;
		this.Peso=Peso;
		this.Altura=Altura;
	}
	
	//Métodos
	public int CalcularIMC() {
		double PI;
		int valor;
		PI=(this.Peso/(Math.pow(this.Altura, 2)));
		if (PI<20)
			valor = -1;
		else if (PI>=20&&PI<=25)
			valor = 0;
		else
			valor = 1;
		return valor;
	}
	
	public boolean esMayordeEdad() {
		if (this.Edad>=18)
			return true;
		else
			return false;
	}
	
	public char comprobarSexo(char Sexo){
		if(Sexo=='H'||Sexo=='h'||Sexo=='M'||Sexo=='m')
			System.out.println("El sexo ingresado es correcto");
		else 
			this.Sexo='H';
		return this.Sexo;
	}
	
	public String generaCedula() {
		Random rng = new Random();
		String letrasDNI = "ndwefowhfñowh";
		this.numCed = rng.nextInt(800000)+100000;
		return this.Cedula;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre=Nombre;
	}
	
	public void setEdad(int Edad) {
		this.Edad=Edad;
	}
	
	public void setSexo(char Sexo) {
		this.Sexo=Sexo;
	}
	
	public void setPeso(float Peso) {
		this.Peso=Peso;
	}
	
	public void setAltura(float Altura) {
		this.Altura=Altura;
	}