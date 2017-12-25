package innerex2;
/*
	얼굴{
		눈{}
		코{}
		입{}
	}
	Face{
		int baseColor = 123;
		class Eye{int eyeLen, eyeH, eyeW, color=baseColor;	메서드(); 메서드();};
		class Nose{int nLen, nH, nW,nColor=baseColor;}
		class Mouth{int mLen, mW, mColor=baseColor;}
	
	}
 */
class Face{
	int faceColor=0XFF0001;
	class Eye{
		int eyeColor = faceColor;

//		public Eye(int eyeColor) {	사용자가 눈 색 설정하기
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
		//얼굴 색깔
		
		//눈 코 입 출력해서 얼굴과 대조
		Face face = new Face();
		Face.Eye eye = face.new Eye();
		System.out.println("얼굴 : "+face.faceColor);
		System.out.println("눈 : "+eye.eyeColor);
		//사용자가 눈 색 설정하기
		//Face.Eye eye = face.new Eye(???????)
		Face.Nose nose = face.new Nose();
		System.out.println("코 : "+nose.noseColor);
		Face.Mouth mouth = face.new Mouth();
		System.out.println("입 : "+mouth.mouthColor);
		face.faceColor = 5555;
		System.out.println("얼굴 : "+face.faceColor);
		System.out.println("눈 : "+face.new Eye().eyeColor);
		System.out.println("코 : "+face.new Nose().noseColor);
		System.out.println("입 : "+face.new Mouth().mouthColor);
	}
}
