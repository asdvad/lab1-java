package ua.lviv.iot.firstLabJava;

public class PackOfMilk {

	private String producer;

	private int fatContentInPercents;

	private int volumeOfPackInML;

	private int caloriesIn100Grams;

	private String typeOfPack;

	private int experationDateInDays;
	
	private static boolean existanceOfCap;

	protected String producerCountry;

	protected String description;
	

	public PackOfMilk(String producer, int fatContentInPercents, int volumeOfPackInML, int caloriesIn100Grams,
			String typeOfPack, int experationDateInDays, boolean existanceOfCap, String producerCountry, String description) {
		this.producer = producer;
		this.fatContentInPercents = fatContentInPercents;
		this.volumeOfPackInML = volumeOfPackInML;
		this.caloriesIn100Grams = caloriesIn100Grams;
		this.typeOfPack = typeOfPack;
		this.experationDateInDays = experationDateInDays;
		PackOfMilk.existanceOfCap = existanceOfCap;
		this.producerCountry = producerCountry;
		this.description = description;
	}
	
	public PackOfMilk(String producer, int fatContentInPercents, int volumeOfPackInML, int caloriesIn100Grams) {
		
		this(producer, fatContentInPercents, volumeOfPackInML, caloriesIn100Grams, null , 0, false, null, null);
	}
	
	public PackOfMilk() {
		
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getFatContentInPercents() {
		return fatContentInPercents;
	}

	public void setFatContentInPercents(int fatContentInPercents) {
		this.fatContentInPercents = fatContentInPercents;
	}

	public int getVolumeOfPackInML() {
		return volumeOfPackInML;
	}

	public void setVolumeOfPackInML(int volumeOfPackInML) {
		this.volumeOfPackInML = volumeOfPackInML;
	}

	public int getCaloriesIn100Grams() {
		return caloriesIn100Grams;
	}

	public void setCaloriesIn100Grams(int caloriesIn100Grams) {
		this.caloriesIn100Grams = caloriesIn100Grams;
	}

	public String getTypeOfPack() {
		return typeOfPack;
	}

	public void setTypeOfPack(String typeOfPack) {
		this.typeOfPack = typeOfPack;
	}

	public int getExperationDateInDays() {
		return experationDateInDays;
	}

	public void setExperationDateInDays(int experationDateInDays) {
		this.experationDateInDays = experationDateInDays;
	}

	public static boolean isExistanceOfCap() {
		return existanceOfCap;
	}

	public static void setExistanceOfCap(boolean existanceOfCap) {
		PackOfMilk.existanceOfCap = existanceOfCap;
	}

	public String getProducerCountry() {
		return producerCountry;
	}

	public void setProducerCountry(String producerCountry) {
		this.producerCountry = producerCountry;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "PackOfMilk [producer=" + producer + ", fatContentInPercents=" + fatContentInPercents
				+ ", volumeOfPackInML=" + volumeOfPackInML + ", caloriesIn100Grams=" + caloriesIn100Grams
				+ ", typeOfPack=" + typeOfPack + ", experationDateInDays=" + experationDateInDays + ", producerCountry="
				+ producerCountry + ", description=" + description + "]";
	}
	
	public String printExistanceOfCap(){
        return "Existance Of Cap = " + existanceOfCap;
    }
    public static String printStaticExistanceOfCap(){
        return "Static Existance Of Cap = " + existanceOfCap;
    }

    public void resetValues(String producer, int fatContentInPercents, int volumeOfPackInML, int caloriesIn100Grams,
			String typeOfPack, int experationDateInDays, boolean existanceOfCap, String producerCountry, String description) {
        this.producer = producer;
        this.fatContentInPercents = fatContentInPercents;
        this.volumeOfPackInML = volumeOfPackInML;
        this.caloriesIn100Grams = caloriesIn100Grams;
        this.typeOfPack = typeOfPack;
        this.experationDateInDays = experationDateInDays;
        PackOfMilk.existanceOfCap = existanceOfCap;
        this.producerCountry = producerCountry;
        this.description = description;
    }


}