package TensileStressCalculator;


public class TensileStress {
      // &=(M × Y)×I [N/mm^2]

      // M = (P × R)(1 - COS(@)) [N.mm]
      // M:굽힘 모멘트
      // @: 구부리는 각도

      // P = ☆ × A [N]

      // ☆ : 파이프고유의 인장응력 [Mpa]
      // A : 파이프의 단면적 [mm^2]

      // Y = (D/2)(1-cos(@/2)) [mm]
      // Y : 중심축으로 부터 파이프의 외각까지의 거리
      // D : 지름

      // I = 파이((D^4 - d^4)/4) [mm^4]  => I : 파이프 단면적의 관성 모멘트 
      
      // D : 외경 d : 내경

      // D : 38.1 mm
      // d : 37.1 mm
      // R : 100
      // 130도 벤딩
}
