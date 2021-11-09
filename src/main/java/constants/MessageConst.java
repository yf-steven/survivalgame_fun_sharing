package constants;

/**
 *
 * 各出力メッセージを定義するEnumクラス
 *
 */
public enum MessageConst {

    // 認証
    I_LOGINED("ログインしました"),
    E_LOGINED("ログインに失敗しました"),
    I_LOGOUT("ログアウトしました"),

    // DB更新
    I_REGISTERED("登録が完了しました"),
    I_UPDATED("登録が完了しました"),
    I_DELETED("削除が完了しました"),

    // バリデーション
    E_NONICKNAME("ニックネームを入力してください"),
    E_NOPASSWORD("パスワードを入力してください"),
    E_NOMAIL("Eメールを入力してください"),
    E_NICKNAME_EXIST("入力されたニックネームは既に存在しています"),
    E_MAIL_EXIST("入力されたEメールは既に存在しています"),
    E_NOTITLE("タイトルを入力してください"),
    E_NOCONTENT("本文を入力してください");

    /**
     * 文字列
     */
    private final String text;

    /**
     * コンストラクタ
     */
    private MessageConst(final String text) {
        this.text = text;
    }

    /**
     * 値(文字列)取得
     */
    public String getMessage() {
        return this.text;
    }
}
