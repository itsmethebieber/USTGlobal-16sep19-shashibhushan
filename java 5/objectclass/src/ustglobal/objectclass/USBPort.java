package ustglobal.objectclass;

public class USBPort {

	public static void connect(Object obj) {
		
		if(obj instanceof Mouse) {
			Mouse m = (Mouse)obj;
			m.click();
			m.move();
		}else if(obj instanceof Pendrive){
			Pendrive p = (Pendrive)obj;
				p.read();
				p.write();
				
			}else  {
				System.out.println("unidentified source");
			}
		}
		
	}

