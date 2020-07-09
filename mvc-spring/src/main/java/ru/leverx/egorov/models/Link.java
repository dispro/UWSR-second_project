package ru.leverx.egorov.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@Entity
@Table(name = "links")
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Title")
    private String Title;
    @Column(name = "Ref")
    private String Ref;
    @Column(name = "DescriptionLink")
    private String DescriptionLink;
    @Column(name = "IsUseful")
    private int IsUseful;
    @Column(name = "IsUseless")
    private int IsUseless;

    public Link(String title, String ref, String descriptionLink, int isUseful, int isUseless) {
        Title = title;
        Ref = ref;
        DescriptionLink = descriptionLink;
        IsUseful = isUseful;
        IsUseless = isUseless;
    }

    public Link(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getRef() {
        return Ref;
    }

    public void setRef(String ref) {
        Ref = ref;
    }

    public String getDescriptionLink() {
        return DescriptionLink;
    }

    public void setDescriptionLink(String descriptionLink) {
        DescriptionLink = descriptionLink;
    }

    public int getIsUseful() {
        return IsUseful;
    }

    public void setIsUseful(int isUseful) {
        IsUseful = isUseful;
    }

    public int getIsUseless() {
        return IsUseless;
    }

    public void setIsUseless(int isUseless) {
        IsUseless = isUseless;
    }
}
