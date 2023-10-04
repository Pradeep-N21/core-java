public class Television
{
   String name;
   float dispalySize;
   int numberOfChannel;
   String channelName;
   int version;
   String tvType;
   String displyaType;
   String model;
   int numberOfRemote;
   String onlineSupport;

Television(String name,float dispalySize,int numberOfChannel,String channelName,int version,string tvType,String displyaType,String model,int numberOfRemote,int onlineSupport
(
   this.name=name;
   this.dispalySize=dispalySize;
   this.numberOfChannel=numberOfChannel;
   this.channelName=channelName;
   this.version=version;
   this.tvType=tvType;
   this.displyaType=displyaType;
   this.model=model;
   this.numberOfRemote=numberOfRemote;
   this.onlineSupport=onlineSupport;
   }
   public static void main(string[] args)
   {
	   Television obj1 = new Television("Thomson",36.5f,500,"Zee",7,"Smart TV","LCD","Thomson R9",2,"yes");
	   System.out.println("First Object:" obj1.name);
   }
   
  } 
   