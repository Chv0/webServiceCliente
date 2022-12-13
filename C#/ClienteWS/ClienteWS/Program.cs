using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace ClienteWS
{
    internal class Program
    {
        static void Main(string[] args)
        {
            ServiceClienteWS.wsoperacionesClient clientes = new ServiceClienteWS.wsoperacionesClient();


            //Loggin
            if (clientes.Loggin("paver", "ta123"))
            {
                Console.WriteLine("Credenciales correctas");
            }
            else
            {
                Console.WriteLine("Credenciales incorrectas");
            }

            //realizar pago
            if (clientes.ProcesarPago(50, 100)>=0)
            {
                Console.WriteLine("Pago realizado");
            }
            else
            {
                Console.WriteLine("Dinero  insuficiente");
            }


            clientes.Close();
            Console.ReadKey();
        }
    }
}
