package com.appchina.devnew.entity;

import java.io.Serializable;
import java.util.Date;

public class Application implements Serializable{

    private static final long serialVersionUID = -4095886138258540772L;

    private Integer applicationId;

    private Integer categoryId;

    private Integer userId;

    private String name;

    private String version;

    private Double price;

    private Integer downloadcount;

    private Date lastmodifiedtime;

    private Integer filesize;

    private String language;

    private String homepage;

    private String keywords;

    private String copyright;

    private String supportpage;

    private String supportemail;

    private Integer flag;

    private Integer updatedby;

    private Integer desstatus;

    private Integer pacstatus;

    private Float score;

    private Integer scorecount;

    private Integer root;

    private Integer branchfrom;

    private Integer upgradefrom;

    private Integer star1;

    private Integer star2;

    private Integer star3;

    private Integer star4;

    private Integer star5;

    private String batchdevname;

    private String sdescription;

    private String fakeauthor;

    private String taglist;

    private Integer appplusStatus;

    private String marketSpider;

    private String charge;

    private String internet;

    private String banner;

    private String bigIcon;

    private Integer lockv;

    private String description;

    private String updateMsg;

    private Integer linkXpkId;

    private String prePackageName;

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Integer getDesstatus() {
        return desstatus;
    }

    public void setDesstatus(Integer desstatus) {
        this.desstatus = desstatus;
    }

    public Integer getPacstatus() {
        return pacstatus;
    }

    public void setPacstatus(Integer pacstatus) {
        this.pacstatus = pacstatus;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getDownloadcount() {
        return downloadcount;
    }

    public void setDownloadcount(Integer downloadcount) {
        this.downloadcount = downloadcount;
    }

    public Date getLastmodifiedtime() {
        return lastmodifiedtime;
    }

    public void setLastmodifiedtime(Date lastmodifiedtime) {
        this.lastmodifiedtime = lastmodifiedtime;
    }

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage == null ? null : homepage.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright == null ? null : copyright.trim();
    }

    public String getSupportpage() {
        return supportpage;
    }

    public void setSupportpage(String supportpage) {
        this.supportpage = supportpage == null ? null : supportpage.trim();
    }

    public String getSupportemail() {
        return supportemail;
    }

    public void setSupportemail(String supportemail) {
        this.supportemail = supportemail == null ? null : supportemail.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(Integer updatedby) {
        this.updatedby = updatedby;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Integer getScorecount() {
        return scorecount;
    }

    public void setScorecount(Integer scorecount) {
        this.scorecount = scorecount;
    }

    public Integer getRoot() {
        return root;
    }

    public void setRoot(Integer root) {
        this.root = root;
    }

    public Integer getBranchfrom() {
        return branchfrom;
    }

    public void setBranchfrom(Integer branchfrom) {
        this.branchfrom = branchfrom;
    }

    public Integer getUpgradefrom() {
        return upgradefrom;
    }

    public void setUpgradefrom(Integer upgradefrom) {
        this.upgradefrom = upgradefrom;
    }

    public Integer getStar1() {
        return star1;
    }

    public void setStar1(Integer star1) {
        this.star1 = star1;
    }

    public Integer getStar2() {
        return star2;
    }

    public void setStar2(Integer star2) {
        this.star2 = star2;
    }

    public Integer getStar3() {
        return star3;
    }

    public void setStar3(Integer star3) {
        this.star3 = star3;
    }

    public Integer getStar4() {
        return star4;
    }

    public void setStar4(Integer star4) {
        this.star4 = star4;
    }

    public Integer getStar5() {
        return star5;
    }

    public void setStar5(Integer star5) {
        this.star5 = star5;
    }

    public String getBatchdevname() {
        return batchdevname;
    }

    public void setBatchdevname(String batchdevname) {
        this.batchdevname = batchdevname == null ? null : batchdevname.trim();
    }

    public String getSdescription() {
        return sdescription;
    }

    public void setSdescription(String sdescription) {
        this.sdescription = sdescription == null ? null : sdescription.trim();
    }

    public String getFakeauthor() {
        return fakeauthor;
    }

    public void setFakeauthor(String fakeauthor) {
        this.fakeauthor = fakeauthor == null ? null : fakeauthor.trim();
    }

    public String getTaglist() {
        return taglist;
    }

    public void setTaglist(String taglist) {
        this.taglist = taglist == null ? null : taglist.trim();
    }

    public Integer getAppplusStatus() {
        return appplusStatus;
    }

    public void setAppplusStatus(Integer appplusStatus) {
        this.appplusStatus = appplusStatus;
    }

    public String getMarketSpider() {
        return marketSpider;
    }

    public void setMarketSpider(String marketSpider) {
        this.marketSpider = marketSpider == null ? null : marketSpider.trim();
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge == null ? null : charge.trim();
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet == null ? null : internet.trim();
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner == null ? null : banner.trim();
    }

    public String getBigIcon() {
        return bigIcon;
    }

    public void setBigIcon(String bigIcon) {
        this.bigIcon = bigIcon == null ? null : bigIcon.trim();
    }

    public Integer getLockv() {
        return lockv;
    }

    public void setLockv(Integer lockv) {
        this.lockv = lockv;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUpdateMsg() {
        return updateMsg;
    }

    public void setUpdateMsg(String updateMsg) {
        this.updateMsg = updateMsg;
    }

    public Integer getLinkXpkId() {
        return linkXpkId;
    }

    public void setLinkXpkId(Integer linkXpkId) {
        this.linkXpkId = linkXpkId;
    }

    public String getPrePackageName() {
        return prePackageName;
    }

    public void setPrePackageName(String prePackageName) {
        this.prePackageName = prePackageName;
    }

    @Override
    public String toString() {
        return "Application{" +
                "applicationId=" + applicationId +
                ", categoryId=" + categoryId +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", price=" + price +
                ", downloadcount=" + downloadcount +
                ", lastmodifiedtime=" + lastmodifiedtime +
                ", filesize=" + filesize +
                ", language='" + language + '\'' +
                ", homepage='" + homepage + '\'' +
                ", keywords='" + keywords + '\'' +
                ", copyright='" + copyright + '\'' +
                ", supportpage='" + supportpage + '\'' +
                ", supportemail='" + supportemail + '\'' +
                ", flag=" + flag +
                ", updatedby=" + updatedby +
                ", desstatus=" + desstatus +
                ", pacstatus=" + pacstatus +
                ", score=" + score +
                ", scorecount=" + scorecount +
                ", root=" + root +
                ", branchfrom=" + branchfrom +
                ", upgradefrom=" + upgradefrom +
                ", star1=" + star1 +
                ", star2=" + star2 +
                ", star3=" + star3 +
                ", star4=" + star4 +
                ", star5=" + star5 +
                ", batchdevname='" + batchdevname + '\'' +
                ", sdescription='" + sdescription + '\'' +
                ", fakeauthor='" + fakeauthor + '\'' +
                ", taglist='" + taglist + '\'' +
                ", appplusStatus=" + appplusStatus +
                ", marketSpider='" + marketSpider + '\'' +
                ", charge='" + charge + '\'' +
                ", internet='" + internet + '\'' +
                ", banner='" + banner + '\'' +
                ", bigIcon='" + bigIcon + '\'' +
                ", lockv=" + lockv +
                ", description='" + description + '\'' +
                ", updateMsg='" + updateMsg + '\'' +
                ", linkXpkId=" + linkXpkId +
                ", prePackageName='" + prePackageName + '\'' +
                '}';
    }
}