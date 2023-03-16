package Second_Basic_Statistics;

public class S_Basic_Statistics
{
    /*
    Excel 수식 및 함수에 대한 모든 것

    함수 사용하기
    1. 결괏값을 표시할 셀에 함수를 입력함.
    2. 함수에 활용될 값들이 포함된 셀의 범위를 입력함
    3. Enter를 누르면 함수가 입력된 셀에 결과값이 나타남.

    AVERAGE - 인수의 평균을 구함
    CHISQ.DIST - 카이제곱 분포의 단측 검정 확률을 구함
    CHISQ.TEST - 독립성 테스트를 반환함
    CORREL - 두 데이터 세트 간의 상관계수를 구함
    COUNTIF - 주어진 특정 기준을 충족하는 범위 내의 비어있지 않은 셀의 수를 구함
    DAVERAGE - 데이터베이스에 포함된 항목 집합의 평균을 구함
    F.DIST - 확률 분포를 구함
    F.TEST - F-검정의 결과를 반환함
    FORECAST - 선형 추세를 따라 값을 반환함
    FREQUENCY - 빈도 분포를 세로 배열로 반환함
    GEOMEAN - 기하평균을 계산함
    INTERCEPT - 회귀선이 y축과 교차하는 지점을 반환함
    KURT - 데이터 세트의 첨도를 반환함
    LINEST - 선형 추세의 매개 변수를 반환함
    MEDIAN - 주어진 숫자들의 중앙값을 구함
    MODE.MULTI - 데이터 세트에서 최빈값(mode값)들을 반환함
    MODE.SNGL - 데이터 세트에서 단일 최빈값(mode값)을 반환함
    NORM.S.DIST - 표준 정규 누적 분포를 구함
    PEARSON - 피어슨 적률 상관계수를 구함
    QUARTILE.INC - 데이터 세트의 사분위수를 반환
    SKEW - 분포의 왜곡도를 반환함.
    SLOPE - 선형 회귀 직선의 기울기를 반환함
    SSTANDARDIZE - 정규화된 값을 반환함
    STDEV.P - 전체 모집단을 기준으로 표준편차를 계산함.
    STDEV.S - 표본을 기준으로 표준편차를 계산함
    STEYX - 회귀 분석에서 각 x에 대해 예측된 y값의 표준 오차를 구함
    T.DIST - t-분포의 결과를 반환함
    T.TEST - t-검정과 관련된 확률을 계산함
    TREND - 선형 추세를 따라 값을 반환함
    VAR.P - 전체 모집단을 기준으로 분산을 계산함.
    VAR.S - 샘플을 기준으로 분산을 추정함.
    Z.TEST - 단측 z값의 확률을 반환함

    =SUM(3,4) - 숫자들을 합하여 7이라는 값을 반환
    =SUM(A2:A4) - A2셀에서 A4셀까지의 값들의 합을 반환
    =SUM(A2:A4,6) - A2셀에서 A4셀까지의 값들의 합에 6을 더한 값을 반환
    =SUM(A6,A8,4) - A6셀에서 A8셀까지의 값들의 합에 4를 더한 값을 반환

    중심경향 측정값(measure of central tendency)
    - 평균은 평균(mean), 중앙값(median), 최빈값(mode) - 3가지 값으로 나뉨

    평균(mean)
    - 가장 널리 활용되는 평균(average)
    - 특정 집단의 모든 값의 합계를 그 집단에 속한 값들의 개수로 나눈 값을 의미

    -X바 (bar)는 점수 그룹의 평균값 또는 평균을 나타냄
    - 시그마(sigma)는 그리스 문자로서, 다음에 나오는 모든 값들을 합산하라는 뜻의 합계 기호
    - X는 점수 집단에 속한 개별 점수
    - n은 평균을 계산할 표본의 크기

    평균 계산하기
    1. 하나 이상의 열에 집합 내 모든 값들을 나열하고, 각 값들은 모두 X에 해당함.
    2. 모든 값들의 합계를 계산하세요
    3. 합계를 값들의 개수로 나눔

    평균은 떄로 문자 M으로 표시되며, 전형적인 값, 평균값 또는 가장 중심적인 값
    - 모집단 평균은 그리스 기호 mu(뮤)로 표현됨.
    - 수식에서 소문자 n은 평균이 계산되는 표본의 크기를 나타냄.
    - 대문자 N은 모집단의 크기를 나타냄

    표준 평균(sample mean)은 모집단 평균(population mean)을 가장 정확하게 반영하는 중심경향의 척도
    - 평균은 시소의 받침대와 같음. 평균을 기준으로 한 쪽에 있는 모든 값이 평균의 다른 쪽에 있는 모든 값과 같은 가중치를 갖는 정중앙점

    평균(mean)에 대해 기억해야 할 사항
    - 좋든 나쁘든 평균은 극단적인 값에 매우 민감함.
    극단적인 값은 평균을 한 방향 또는 다른 방향으로 끌어당겨서 평균이 점수 집합을 제대로 대표하지 못하도록 만들고, 이로 인해 중심경향의 척도로서 평균의 유용성은 줄어들게 됨.
    - 물론 평균이 얼마나 대표성을 지니는지 여부는 그 계산 대상이 되는 값들에 영향을 받음.

    산술 평균(arithmetic mean)

    조화평균(harmonic mean)

    가중평균 계산하기
    1. 평균을 구할 표본의 모든 값을 나열하세요.
    2. 각 값이 나타나는 빈도수를 나열하세요.
    3. 세 번째 열에 표시된 대로 각 값에 빈도수를 곱하세요.
    4. '값 X 빈도수' 열의 모든 값을 합합니다.
    5. 이 값을 빈도수의 합으로 나눔.

    중앙값 계산하기
    1. 가장 높은 값에서 가장 낮은 값 또는 가장 낮은 값에서 가장 높은 값의 순으로 값들을 나열하세요.
    2. 가장 중간에 있는 점수가 중앙값임

    - 중앙값과 함께 백분위수에 대해서도 알고 있어야 함.
    - 백분위 수는 한 분포 또는 점수 집합에 있는 특정 값과 같거나 그보다 작은 경우는 백분율을 정의하는 데 사용됨.
    - 점수가 75번째 백분위수 에 있다면 이는 그 점수가 분포에 있는 다른 점수들의 75% 이상임을 의미함.
    - 중앙값은 50번째 백분위수라고도 하는데 그 이유는 이 값 아래에 분포 중 50%의 수가 존재하기 때문
    - Q1이라 불리는 25번째 백분위수와 Q3라고 부르는 75번째 백분위수도 유용함.
    - Q2는 중앙값에 해당됨

    중앙값과 관련해 흥미롭고 중요한 특징이 몇 가지 있음

    최빈값 계산하기
    1. 분포에 속한 모든 값들을 나열하되, 각 값을 한 번씩만 나열함.
    2. 각 값이 발생하는 횟수를 계산함.
    3. 가장 자주 발생하는 값이 최빈값
     */
}
