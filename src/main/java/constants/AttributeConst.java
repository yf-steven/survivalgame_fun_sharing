package constants;

/**
 *
 * 画面の項目値等を定義するEnumクラス
 *
 */
public enum AttributeConst {

    // フラッシュメッセージ
    FLUSH("flush"),

    // 一覧画面共通
    MAX_ROW("maxRow"),
    PAGE("page"),

    // 入力フォーム共通
    TOKEN("_token"),
    ERR("errors"),

    // ログイン画面
    LOGIN_ERR("loginError"),

    // ユーザー管理
    USER("user"),
    USERS("users"),
    USERS_COUNT("users_count"),
    USER_ID("user_id"),
    USER_MAIL("user_mail"),
    USER_PASSWORD("user_password"),
    USER_NAME("name"),

    // レポート管理
    REPORT("report"),
    REPORTS("reports"),
    REP_COUNT("reports_count"),
    REP_ID("report_id"),
    REP_TITLE("report_title"),
    REP_CONTENT("report_content"),
    REP_FIELD("report_field"),
    REP_RECOMMEND("report_recommend"),
    REP_IMPROVEMENT("report_improvement");

    private final String text;
    private final Integer i;

    private AttributeConst(final String text) {
        this.text = text;
        this.i = null;
    }

    private AttributeConst(final Integer i) {
        this.text = null;
        this.i = i;
    }

    public String getValue() {
        return this.text;
    }

    public Integer getIntegerValue() {
        return this.i;
    }
}
