public class Gaji extends Pegawai {
    //*extends merupakan salah satu syarat dari melakukan pewarisan(POLYMORPHISME) dari superclass menjadi subclass*//

    private double salary;

    public Gaji(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck() {
        
        /*method mailcheck() merupakan method yang dimiliki oleh subclass yaitu class pegawai,yang dimana terjadi
        overriding dikarenakan memiliki nama yang sama dengan method yang ada pada superclass,karena method pada subclass
        ini mengubah isinya atau referensinya dimana bukan lagi bereferensi kepada superclass. Maka ini dinamakan
        UPCASTING
         */
       
         System.out.println("Memeriksa Kelas Gaji dalam Surat ");
        System.out.println("Surat ditujukan Untuk saudara " + getName() + "dengan gaji " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computerPay() {
        System.out.println("Menghitung Pembayaran Gaji Untuk " + getName());
        return salary / 52;
    }

}