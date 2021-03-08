package com.junit.training.ejercicio1;

public class DetallesEmpleadoLogica {
	
	   // Calcular el salario anual de un empleado
	   public double calcularSalarioAnual(DetallesEmpleado detallesEmpleado) {
	      double salarioAnual = 0;
	      salarioAnual = detallesEmpleado.getSalarioMensual() * 12;
	      return salarioAnual;
	   }
		
	   // Calculate el monto del apraisal de un empleado
	   public double calcularAppraisal(DetallesEmpleado detallesEmpleado) {
	      double appraisal = 0;
			
	      if(detallesEmpleado.getSalarioMensual() < 10000){
	         appraisal = 500;
	      }else{
	         appraisal = 1000;
	      }
			
	      return appraisal;
	   }
	}
