package innerex2;
/*
	��{
		��{}
		��{}
		��{}
	}
	Face{
		int baseColor = 123;
		class Eye{int eyeLen, eyeH, eyeW, color=baseColor;	�޼���(); �޼���();};
		class Nose{int nLen, nH, nW,nColor=baseColor;}
		class Mouth{int mLen, mW, mColor=baseColor;}
	
	}
 */
class Face{
	int faceColor=0XFF0001;
	class Eye{
		int eyeColor = faceColor;

//		public Eye(int eyeColor) {	����ڰ� �� �� �����ϱ�
//			this.eyeColor = eyeColor;
//		}
//		
	}
	class Nose{
		int noseColor = faceColor;
	}
	class Mouth{
		int mouthColor = faceColor;
	}

}

public class FaceMain {
	public static void main(String[] args) {
		//�� ����
		
		//�� �� �� ����ؼ� �󱼰� ����
		Face face = new Face();
		Face.Eye eye = face.new Eye();
		System.out.println("�� : "+face.faceColor);
		System.out.println("�� : "+eye.eyeColor);
		//����ڰ� �� �� �����ϱ�
		//Face.Eye eye = face.new Eye(???????)
		Face.Nose nose = face.new Nose();
		System.out.println("�� : "+nose.noseColor);
		Face.Mouth mouth = face.new Mouth();
		System.out.println("�� : "+mouth.mouthColor);
		face.faceColor = 5555;
		System.out.println("�� : "+face.faceColor);
		System.out.println("�� : "+face.new Eye().eyeColor);
		System.out.println("�� : "+face.new Nose().noseColor);
		System.out.println("�� : "+face.new Mouth().mouthColor);
	}
}
