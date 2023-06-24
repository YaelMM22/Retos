package Viernes;

public class Sueldos {
	private double tiempo_extra;
	private double tiempo_hrs;
	private double SueldoBruto;
	
	public Sueldos () {
	}
	
	public void settiempo_hrs(double tiempo_hrs) {
		this.tiempo_hrs = tiempo_hrs;
	}
	public void settiempo_extra(double tiempo_extra) {
		this.tiempo_extra = tiempo_extra;
	}
	public double SueldoNeto() {
		return (tiempo_hrs*72.87)+(tiempo_extra*25.96);
	}
	
	public void setSueldoBruto(double SueldoBruto) {
		this.SueldoBruto = SueldoBruto;
	}
	
	public double SueldoNeto() {
		if(SueldoBruto <= 2000) {
			return SueldoBruto*0.84;
		}else {
			return SueldoBruto*0.82;
		}
	}
	
	
	
	//private double sueldo;
	//private double sueldoNeto;
	
	//sueldo = (tiempo_extra*25.96)+(tiempo_hrs*72.87);
	
	//public void Sueldo(double tiempo_extra,double tiempo_hrs) {
		//this.tiempo_extra = tiempo_extra;
		//this.tiempo_hrs = tiempo_hrs;
	//}
	//public void getTiempo_extra() {
		//return ;
	//}
	//public void setTiempo_extra(double tiempo_extra) {
		//this.tiempo_extra = tiempo_extra;
	//}
	
	//public double getTiempo_hrs() {
		//return tiempo_hrs;
	//}
	//public void setTiempo_hrs(double tiempo_hrs) {
		//this.tiempo_hrs = tiempo_hrs;
	//}
	//public double SueldoBruto() {
		//return sueldo = (tiempo_extra*25.96)+(tiempo_hrs*72.87);
	//}
	//public double SueldoNeto() {
		 //if (sueldo > 2000) {
	         //  return sueldo*0.82;
	       // } else {
	        //	return sueldo*0.84;
	        //}
	//}
	
}
