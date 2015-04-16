package dto;

import java.math.BigDecimal;

/**
 * Created by VMakarenko on 4/15/2015.
 */
public class ImageDto {
    private int width;
    private int height;
    private BigDecimal size;
    private String link;
    private String linkToOrigin;
    private String name;
    private byte[] preview;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLinkToOrigin() {
        return linkToOrigin;
    }

    public void setLinkToOrigin(String linkToOrigin) {
        this.linkToOrigin = linkToOrigin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getPreview() {
        return preview;
    }

    public void setPreview(byte[] preview) {
        this.preview = preview;
    }
}
