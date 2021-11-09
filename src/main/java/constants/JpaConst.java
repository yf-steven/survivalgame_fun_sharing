package constants;

/**
 *
 * DB関連の項目値を定義するインターフェイス
 *※インターフェイスに定義した変数はpublic static final 修飾子がついているとみなされる
 */
public interface JpaConst {

    // persistence-unit名
    String PERSISTENCE_UNIT_NAME = "survivalgame_fun_sharing";

    // データ取得件数の最大値
    int ROW_PER_PAGE = 15; // 1ページに表示するレコードの数

    // ユーザーテーブル
    String TABLE_USER = "users"; //テーブル名
    // ユーザーテーブルカラム
    String USER_COL_ID = "id"; // id
    String USER_COL_MAIL = "mail"; // Eメール
    String USER_COL_NICKNAME = "nickname"; // ニックネーム
    String USER_COL_PASSWORD = "password"; // パスワード
    String USER_COL_INTRODUCE = "introduce"; // 紹介文
    String USER_COL_GUN = "gun"; // お気に入りエアガン
    String EMP_COL_CREATED_AT = "created_at"; // 登録日時
    String EMP_COL_UPDATED_AT = "updated_at"; // 更新日時

    // レポートテーブル
    String TABLE_REP = "reports"; // テーブル名
    // レポートテーブルカラム
    String REP_COL_ID = "id"; // id
    String REP_COL_USER = "user_id"; // レポートを作成したユーザーのid
    String REP_COL_TITLE = "title"; // レポートのタイトル
    String REP_COL_CONTENT = "content"; // レポートの内容
    String REP_COL_FIELD = "field"; // サバゲーフィールド
    String REP_COL_RECOMMEND = "recommend"; // そのフィールドのオススメポイント
    String REP_COL_IMPROVEMENT = "improvement"; // そのフィールドの改善点
    String REP_COL_CREATED_AT = "created_at"; // 登録日時
    String REP_COL_UPDATED_AT = "updated_at"; // 更新日時

    // Entity名
    String ENTITY_USER = "user"; // ユーザー
    String ENTITY_REP = "report"; // レポート

    // JPQL内パラメータ
    String JPQL_PARM_MAIL = "mail"; // Eメール
    String JPQL_PARM_PASSWORD = "password"; // パスワード
    String JPQL_PARM_USER = "user"; // ユーザー

    // NamedQueryのnameとquery
    // 全てのユーザーをidの降順に取得する
    String Q_USER_GET_ALL = ENTITY_USER + ".getAll"; // name
    String Q_USER_GET_ALL_DEF = "SELECT u FROM User AS u ORDER BY u.id DESC"; // query
    // 全てのユーザーの件数を取得する
    String Q_USER_COUNT = ENTITY_USER + ".count";
    String Q_USER_COUNT_DEF = "SELECT COUNT(u) FROM User AS u";
    // 全てのレポートをidの降順に取得する
    String Q_REP_GET_ALL = ENTITY_REP + ".getAll";
    String Q_REP_GET_ALL_DEF = "SELECT r FROM Report AS r ORDER BY r.id DESC";
    // 全てのレポートの件数を取得する
    String Q_REP_COUNT = ENTITY_REP + ".count";
    String Q_REP_COUNT_DEF = "SELECT COUNT(r) FROM Report AS r";
    // 指定したユーザーが作成したレポートを全件idの降順に取得する
    String Q_REP_GET_ALL_MINE = ENTITY_REP + ".getAllMine";
    String Q_REP_GET_ALL_MINE_DEF = "SELECT r FROM Report AS r WHERE r.user = :" + JPQL_PARM_USER + " ORDER BY r.id DESC";
    // 指定したユーザーが作成したレポートの件数を取得する
    String Q_REP_COUNT_ALL_MINE = ENTITY_REP + ".countAllMine";
    String Q_REP_COUNT_ALL_MINE_DEF = "SELECT COUNT(r) FROM Report AS r WHERE r.user = :" + JPQL_PARM_USER;
}
