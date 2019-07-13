package com.scnu.ppt.bean;

public class PptInfo extends PptInfoKey {
    private String pptName;

    private String pptImg;
    
    private String pptLocalImg;

    private String pptHref;
    
    private String pptPreviewPic;

    private String htmlUrl;
    
    private String htmlLocalUrl;

    public String getPptName() {
        return pptName;
    }

    public void setPptName(String pptName) {
        this.pptName = pptName == null ? null : pptName.trim();
    }

    public String getPptImg() {
        return pptImg;
    }

    public void setPptImg(String pptImg) {
        this.pptImg = pptImg == null ? null : pptImg.trim();
    }

    public String getPptHref() {
        return pptHref;
    }

    public void setPptHref(String pptHref) {
        this.pptHref = pptHref == null ? null : pptHref.trim();
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl == null ? null : htmlUrl.trim();
    }

	public String getPptLocalImg() {
		return pptLocalImg;
	}

	public void setPptLocalImg(String pptLocalImg) {
		this.pptLocalImg = pptLocalImg;
	}

	public String getHtmlLocalUrl() {
		return htmlLocalUrl;
	}

	public void setHtmlLocalUrl(String htmlLocalUrl) {
		this.htmlLocalUrl = htmlLocalUrl;
	}

	public String getPptPreviewPic() {
		return pptPreviewPic;
	}

	public void setPptPreviewPic(String pptPreviewPic) {
		this.pptPreviewPic = pptPreviewPic;
	}
  
}