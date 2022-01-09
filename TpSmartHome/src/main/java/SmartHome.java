public class SmartHome {

    private final String homeName;
    private final int homeNumber;
    private final Adresse adresse;
    private final RemoteControl remoteControl;

    public SmartHome(ConcretSmartHomeBuilder concretSmartHomeBuilder) {
        this.homeName = concretSmartHomeBuilder.homeName;
        this.homeNumber = concretSmartHomeBuilder.homeNumber;
        this.adresse = concretSmartHomeBuilder.withAdresse;
        this.remoteControl = concretSmartHomeBuilder.withRemoteControl;
    }

    public String getHomeName() {
        return homeName;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public RemoteControl getRemoteControl() {
        return remoteControl;
    }

    public String report() {
        return remoteControl.getResult();
    }

    public static class ConcretSmartHomeBuilder{

        private final String homeName;
        private final int homeNumber;
        private Adresse withAdresse;
        private RemoteControl withRemoteControl;

        public ConcretSmartHomeBuilder(String homeName, int homeNumber){
            this.homeName = homeName;
            this.homeNumber = homeNumber;
        }
        public ConcretSmartHomeBuilder withAdresse(Adresse withAdresse){
            this.withAdresse = withAdresse;
            return this;
        }
        public ConcretSmartHomeBuilder withRemoteControl(RemoteControl withRemoteControl){
            this.withRemoteControl = withRemoteControl;
            return this;
        }
        public SmartHome build(){
            SmartHome smartHome = new SmartHome(this);
            return smartHome;
        }
    }
}
