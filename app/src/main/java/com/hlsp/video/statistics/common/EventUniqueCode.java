package com.hlsp.video.statistics.common;

/**
 * 针对app每一种点击事件进行唯一编码，编码方式参考编码规则
 */
public enum EventUniqueCode {
    ZN_APP_COMMOMEVENT_BOOKSHELF_GOODRECOMMEND("ZN_APP_COMMOMEVENT_BOOKSHELF_GOODRECOMMEND", ""),
    ZN_APP_COMMOMEVENT_BOOKSHELF_SEARCH("ZN_APP_COMMOMEVENT_BOOKSHELF_SEARCH", ""),
    ZN_APP_COMMOMEVENT_BOOKSHELF_BLANKBOOKSHELF_TOBOOKCITY("ZN_APP_COMMOMEVENT_BOOKSHELF_BLANKBOOKSHELF_TOBOOKCITY", ""),
    ZN_APP_COMMOMEVENT_BOOKSHELF_LONGTIMEEDITBOOKSHELF("ZN_APP_COMMOMEVENT_BOOKSHELF_LONGTIMEEDITBOOKSHELF", ""),
    ZN_APP_COMMOMEVENT_BOOKSHELF_MORE_EDITBOOKSHELF("ZN_APP_COMMOMEVENT_BOOKSHELF_MORE_EDITBOOKSHELF", ""),
    ZN_APP_COMMOMEVENT_BOOKSHELF_MORE_CACHE_MANAGE("ZN_APP_COMMOMEVENT_BOOKSHELF_MORE_CACHE_MANAGE", ""),
    ZN_APP_COMMOMEVENT_BOOKSHELF_MORE_PROFILE("ZN_APP_COMMOMEVENT_BOOKSHELF_MORE_PROFILE", ""),
    ZN_APP_COMMOMEVENT_EDIT_BOOKSHELFEDIT("ZN_APP_COMMOMEVENT_EDIT_BOOKSHELFEDIT", ""),
    ZN_APP_COMMOMEVENT_EDIT_CACHEEDIT("ZN_APP_COMMOMEVENT_EDIT_CACHEEDIT", ""),
    ZN_APP_COMMOMEVENT_PROFILE_NIGHT("ZN_APP_COMMOMEVENT_PROFILE_NIGHT", ""),
    ZN_APP_COMMOMEVENT_PROFILE_HELPANDFEEDBACK("ZN_APP_COMMOMEVENT_PROFILE_HELPANDFEEDBACK", ""),
    ZN_APP_COMMOMEVENT_PROFILE_SCORE("ZN_APP_COMMOMEVENT_PROFILE_SCORE", ""),
    ZN_APP_COMMOMEVENT_PROFILE_VERSIONUPDATE("ZN_APP_COMMOMEVENT_PROFILE_VERSIONUPDATE", ""),
    ZN_APP_COMMOMEVENT_PROFILE_FLUSHCACHE("ZN_APP_COMMOMEVENT_PROFILE_FLUSHCACHE", ""),
    ZN_APP_COMMOMEVENT_PROFILE_USEPROTOCOL("ZN_APP_COMMOMEVENT_PROFILE_USEPROTOCOL", ""),
    ZN_APP_COMMOMEVENT_PROFILE_MORESETTING("ZN_APP_COMMOMEVENT_PROFILE_MORESETTING", ""),
    ZN_APP_COMMOMEVENT_PROFILE_MORESETTING_PUSH("ZN_APP_COMMOMEVENT_PROFILE_MORESETTING_PUSH", ""),
    ZN_APP_COMMOMEVENT_PROFILE_MORESETTING_PUSHAUDIO("ZN_APP_COMMOMEVENT_PROFILE_MORESETTING_PUSHAUDIO", ""),
    ZN_APP_COMMOMEVENT_BOOKDETAIL_SWITCHSOURCE("ZN_APP_COMMOMEVENT_BOOKDETAIL_SWITCHSOURCE", ""),
    ZN_APP_COMMOMEVENT_BOOKDETAIL_LATESTCHAPTER("ZN_APP_COMMOMEVENT_BOOKDETAIL_LATESTCHAPTER", ""),
    ZN_APP_COMMOMEVENT_BOOKDETAIL_CATALOG("ZN_APP_COMMOMEVENT_BOOKDETAIL_CATALOG", ""),
    ZN_APP_COMMOMEVENT_BOOKDETAIL_FULLCACHE("ZN_APP_COMMOMEVENT_BOOKDETAIL_FULLCACHE", ""),
    ZN_APP_COMMOMEVENT_BOOKDETAIL("ZN_APP_COMMOMEVENT_BOOKDETAIL", ""),
    ZN_APP_COMMOMEVENT_BOOKDETAIL_ADDBOOKSHELF("ZN_APP_COMMOMEVENT_BOOKDETAIL_ADDBOOKSHELF", ""),
    ZN_APP_COMMOMEVENT_BOOKDETAIL_TRANSCODEREAD("ZN_APP_COMMOMEVENT_BOOKDETAIL_TRANSCODEREAD", ""),
    ZN_APP_COMMOMEVENT_READPAGE_NIGHT("ZN_APP_COMMOMEVENT_READPAGE_NIGHT", ""),
    ZN_APP_COMMOMEVENT_READPAGE_UDSWITCHCHAPTER("ZN_APP_COMMOMEVENT_READPAGE_UDSWITCHCHAPTER", ""),
    ZN_APP_COMMOMEVENT_READPAGE_ADD_ADDLABLE("ZN_APP_COMMOMEVENT_READPAGE_ADD_ADDLABLE", ""),
    ZN_APP_COMMOMEVENT_READPAGE_PULL_ADDLABLE("ZN_APP_COMMOMEVENT_READPAGE_PULL_ADDLABLE", ""),
    ZN_APP_COMMOMEVENT_READPAGE_ORIGINALSITELINK("ZN_APP_COMMOMEVENT_READPAGE_ORIGINALSITELINK", ""),
    ZN_APP_COMMOMEVENT_READPAGE_CATALOG("ZN_APP_COMMOMEVENT_READPAGE_CATALOG", ""),
    ZN_APP_COMMOMEVENT_READPAGE_SETTING_BRIGHTNESSADJUSTMENT("ZN_APP_COMMOMEVENT_READPAGE_SETTING_BRIGHTNESSADJUSTMENT", ""),
    ZN_APP_COMMOMEVENT_READPAGE_SETTING_BRIGHTNESSFOLLOW("ZN_APP_COMMOMEVENT_READPAGE_SETTING_BRIGHTNESSADJUSTMENT", ""),
    ZN_APP_COMMOMEVENT_READPAGE_SETTING_FONTSIZE("ZN_APP_COMMOMEVENT_READPAGE_SETTING_FONTSIZE", ""),
    ZN_APP_COMMOMEVENT_READPAGE_SETTING_BACKGROUND("ZN_APP_COMMOMEVENT_READPAGE_SETTING_BACKGROUND", ""),
    ZN_APP_COMMOMEVENT_READPAGE_SETTING_LINEHEIGHT("ZN_APP_COMMOMEVENT_READPAGE_SETTING_LINEHEIGHT", ""),
    ZN_APP_COMMOMEVENT_READPAGE_SETTING_TURNMODEL("ZN_APP_COMMOMEVENT_READPAGE_SETTING_TURNMODEL", ""),
    ZN_APP_COMMOMEVENT_READPAGE_MORESETTING_CACHE_FULLCACHE("ZN_APP_COMMOMEVENT_READPAGE_MORESETTING_CACHE_FULLCACHE", ""),
    ZN_APP_COMMOMEVENT_READPAGE_MORESETTING_SWITCHSOURCE("ZN_APP_COMMOMEVENT_READPAGE_MORESETTING_SWITCHSOURCE", ""),
    ZN_APP_COMMOMEVENT_READPAGE_MORESETTING_BOOKDETAIL("ZN_APP_COMMOMEVENT_READPAGE_MORESETTING_BOOKDETAIL", ""),
    ZN_APP_COMMOMEVENT_READPAGE_MORESETTING_AUTOREAD_READSPEED("ZN_APP_COMMOMEVENT_READPAGE_MORESETTING_AUTOREAD_READSPEED", ""),
    ZN_APP_COMMOMEVENT_READPAGE_MORESETTING_CROSSCREEN("ZN_APP_COMMOMEVENT_READPAGE_MORESETTING_CROSSCREEN", "");
    private String code;
    private String desc;

    private EventUniqueCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
