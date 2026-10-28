using System;

namespace HelloWorld
{
  class Program
  {
    static void Main(string[] args)
    {
      Console.WriteLine("--------------------"); 
      Console.WriteLine(" ---Baron's Cafe---");   
      Console.WriteLine("--------------------");     
      Console.WriteLine("State your name: ");
      string name = Console.ReadLine();
      Console.WriteLine("Hello" + name + "! My name's Baron may I take your order today? Please input the number for the selected menu"); 
    }
  }
}