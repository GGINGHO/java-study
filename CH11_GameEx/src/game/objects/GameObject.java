package game.objects;

public class GameObject {
		private int id; //아이디
		private String name; //이름
		
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
		
		@Override // 원래 Object의 toString메소드는 주소값을 나타내는데 메소드 오버라이드
		public String toString() {
			return "GameObject [id=" + id + ", name=" + name + "]";
		}

		
}


