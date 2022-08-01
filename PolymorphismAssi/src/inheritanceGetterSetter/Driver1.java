package inheritanceGetterSetter;

public class Driver1 {
	    int id;
	    String name,contact;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
     public String toString()
    {
    return id +" "+name+" "+ contact;	
    }
}
