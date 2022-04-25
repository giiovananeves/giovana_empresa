public class Principal {

    public static void main(String [] args) {

        Vendedor v=new Vendedor();
        v.setNome("Marcelo");
        v.setDataDeEntrada("18/06/2009");
		v.setDepartamento("Vendas");
		v.setEstaNaEmpresa(true);
		v.setRg("645482448");
        v.setSalario(5000);
        
        Gerente g=new Gerente();
        g.setNome("Lucas");
        g.setDataDeEntrada("07/03/2014");
		g.setDepartamento("Produção");
		g.setEstaNaEmpresa(true);
		g.setRg("68789448");
        g.setSalario(8500);

        Surpervisor s=new Supervisor();
        s.setNome("Gustavo");
        s.setDataDeEntrada("02/11/2017");
		s.setDepartamento("Vendas");
		s.setEstaNaEmpresa(true);
		s.setRg("896589448");
        s.setSalario(6000);

        Funcionario f=new Funcionario();
        f.setNome("Tiago");
        f.setDataDeEntrada("27/01/2015");
		f.setDepartamento("Produção");
		f.setEstaNaEmpresa(true);
		f.setRg("87486548");
        f.setSalario(4000);



    }
    
}
