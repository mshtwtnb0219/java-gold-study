# Java Gold Study Report

| Chapter | Topic | Summary | Keyword | Level | File |
|---|---|---|---|:---:|---|
| chap01 | topic11 | ラッパークラス | 基本型→参照型(ボクシング) valueOf() 参照型→基本型(アンボクシング) xxxValue() | A | `src\main\java\org\example\chap01\topic11\Main.java` |
| chap01 | topic12 | オートボクシング　オートアンボクシング | 基本型　→　参照型　/  参照型　→　基本型　動的に変換してくれる  int → Characterみたいな変換はできない | A | `src\main\java\org\example\chap01\topic12\Main.java` |
| chap01 | topic21 | ジェネリクス | 非ジェネリッククラスの場合、オブジェクトを作成する際に別の参照型で定義してそのあとからダウンキャストすると例外が発生するため | C | `src\main\java\org\example\chap01\topic21\Main.java` |
| chap01 | topic22 | ジェネリクス | ジェネリッククラス　ジェネリックインターフェース | B | `src\main\java\org\example\chap01\topic22\Main.java` |
| chap01 | topic23 | ジェネリクス | ジェネリクスの使用 | A | `src\main\java\org\example\chap01\topic23\Main.java` |
| chap01 | topic24 | ジェネリクス | ダイヤモンド演算子 | C | `src\main\java\org\example\chap01\topic24\Main.java` |
| chap01 | topic25 | ジェネリクス | ジェネリックメソッド(staticで宣言可能)   ジェネリクスクラス(インターフェース) staticで宣言が不可能 | C | `src\main\java\org\example\chap01\topic25\Main.java` |
| chap01 | topic26 | ジェネリクス | 境界付き型パラメータ | B | `src\main\java\org\example\chap01\topic26\Main.java` |
| chap01 | topic27 | ジェネリクス | 非境界ワイルドカード型 | C | `src\main\java\org\example\chap01\topic27\Main.java` |
| chap01 | topic28 | ジェネリクス | 境界付きワイルドカード型 上限境界ワイルドカード(<? extends 境界の型>)  下限境界ワイルドカード(<? super 境界の型>) | C | `src\main\java\org\example\chap01\topic28\Main.java` |
| chap01 | topic31 | コレクションフレームワーク | コレクション List Set Queue Map  概念の解説のみ | B | `src\main\java\org\example\chap01\topic31\Main.java` |
| chap01 | topic41 | コレクションフレームワーク | List<E>インターフェース  要素の設定/取得が得意 挿入/削除/リサイズ/並列処理が不得意  LinkedList<E> 挿入/削除/リサイズが得意 取得/並列処理が不得意  Vector<E> ArrayList<E>の同じ性質をもつ　かつマルチスレッド環境で使用するためパフォーマンスが悪い | A | `src\main\java\org\example\chap01\topic41\Main.java` |
| chap01 | topic42 | コレクションフレームワーク | Set<E>インターフェース HashSet<E> LinkedHashSet<E> TreeSet<E> | B | `src\main\java\org\example\chap01\topic42\Main.java` |
| chap01 | topic43 | コレクションフレームワーク | Queue<E> Deque<E> | B | `src\main\java\org\example\chap01\topic43\Main.java` |
| chap01 | topic44 | コレクションフレームワーク | Map<K,V> Mapの全要素を取得 Set<E> keyset = map.keyset()  Mapの全valueを取得 Collection<E> values = map.values()  Mapの全キー/値を取得  Set<Map.Entry<K,V>> entry = map.entrySet() | C | `src\main\java\org\example\chap01\topic44\Main.java` |
| chap01 | topic51 | コレクションのソート | Comparable<T>　compareTo()をOverride this == o (並び替えなし) this < o (this → oの順) this > o ( o → thisの順) | C | `src\main\java\org\example\chap01\topic51\Main.java` |
| chap01 | topic52 | コレクションのソート | Comparator<T> | C★ | `src\main\java\org\example\chap01\topic52\Main.java` |
| chap01 | topic61 | コレクション用の便利なメソッド | Collectionsクラス binarySearchは順序付けである必要がある | A | `src\main\java\org\example\chap01\topic61\Main.java` |
| chap01 | topic62 | コレクション用の便利なメソッド | Arraysクラス | B | `src\main\java\org\example\chap01\topic62\Main.java` |
| chap01 | topic63 | コレクション用の便利なメソッド | 変更不可のコレクション　of() nullも許容されない | C | `src\main\java\org\example\chap01\topic63\Main.java` |

## Level

- A: Good
- B: Review recommended
- C: Needs review
- TODO: Not evaluated