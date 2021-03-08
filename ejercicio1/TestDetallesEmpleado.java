package com.junit.training.ejercicio1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDetallesEmpleado {
   DetallesEmpleadoLogica logicaEmpleado = new DetallesEmpleadoLogica();
   DetallesEmpleado empleado = new DetallesEmpleado();

   //test para verificar el appraisal
   @Test
   public void testCalculateAppriasal() {
      empleado.setNombre("Noe Hernandez");
      empleado.setEdad(25);
      empleado.setMonthlySalary(8000);
		
      double appraisal = logicaEmpleado.calcularAppraisal(empleado);
      assertEquals(500, appraisal, 0.0);
   }

   // test para validar el salario anual
   @Test
   public void testCalculateYearlySalary() {
      empleado.setNombre("Noe Hernandez");
      empleado.setEdad(25);
      empleado.setMonthlySalary(8000);
		
      double salary = logicaEmpleado.calcularSalarioAnual(empleado);
      assertEquals(96000, salary, 0.0);
   }
}
