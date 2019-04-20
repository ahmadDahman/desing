package anative.com.desing;

public class ClinicsModel {
    String DoctorName;
    String Description;
    String img;

    public ClinicsModel(String doctorName, String description, String img) {
        DoctorName = doctorName;
        Description = description;
        this.img = img;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


}
