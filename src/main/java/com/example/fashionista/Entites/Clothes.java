package com.example.fashionista.Entites;


import jakarta.persistence.*;

@Entity
//@Table(name = "cloths")
public class Clothes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clothId;
    @Column(name = "name")
    private String clothName;
    @Column(name = "type")
    private String clothType;
    private String color;
    private String pattern;
    private String material;
    private Long size;


//Disables Relationship connections until fixed.
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    @JsonIgnore
//    private Users user;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "lookId")
    private Looks looks;

    //Nullary
    public Clothes(){

    }


    public Clothes(Long clothId, String clothName, String clothType, String color, String pattern, String material,
            Long size, Looks looks) {
        this.clothId = clothId;
        this.clothName = clothName;
        this.clothType = clothType;
        this.color = color;
        this.pattern = pattern;
        this.material = material;
        this.size = size;
        this.looks = looks;
    }



    public Long getClothId() {
        return clothId;
    }

    public void setClothId(Long clothId) {
        this.clothId = clothId;
    }

    public String getClothName() {
        return clothName;
    }

    public void setClothName(String clothName) {
        this.clothName = clothName;
    }

    public String getClothType() {
        return clothType;
    }

    public void setClothType(String clothType) {
        this.clothType = clothType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Looks getLooks() {
        return looks;
    }

    public void setLooks(Looks looks) {
        this.looks = looks;
    }
    

}
