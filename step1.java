public class step1 {
    public static void main(String[] args) {
        //画面表示；
        String numberSelect;
        System.out.println("株式取引管理システムを開始します");
        do {
            System.out.println("操作するメニューを選んでください");
            System.out.println("1.銘柄マスタ一覧表示");
            System.out.println("2.銘柄マスタ新規登録");
            System.out.println("9.アプリケーションを終了する");
            //ユーザー入力；
            numberSelect = new java.util.Scanner(System.in).nextLine();
            if(numberSelect.equals("1") ){
                System.out.println("「銘柄マスタ一覧表示」が選択されました。");
            }else if (numberSelect.equals("2")){
                System.out.println("「銘柄マスタ新規登録」が選択されました。");
            }else if (numberSelect.equals("9")){
                System.out.println("アプリケーションを終了します。");
            }else {
                System.out.println("“" + numberSelect + "”に対応するメニューは存在しません。");
            }
        }while (!numberSelect.equals("9"));
    }
}
