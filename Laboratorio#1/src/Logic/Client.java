/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author josev
 */
public class Client {

    private String name;
    private String id;
    private String phone;
    private String adress;

    public Client(String name, String id, String phone, String adress) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String toString() {
        String salida;
        salida = "CLIENTE INFORMATION"
                + "\n ----------------------"
                + "\nId=" + this.getId()
                + "\nName" + this.getName()
                + "\nPhone=" + this.getPhone()
                + "\nAdress=" + this.getAdress() + "";
        return salida;
    }

    public static void main(String[] args) {

        //   System.out.println(Client.toString());
    }

}
