package ci.digitalacademy.monetabatoswebspring.services.Impl;

import ci.digitalacademy.monetabatoswebspring.models.School;
import ci.digitalacademy.monetabatoswebspring.repositories.SchoolRepository;
import ci.digitalacademy.monetabatoswebspring.services.SchoolService;
import ci.digitalacademy.monetabatoswebspring.services.dto.SchoolDTO;
import ci.digitalacademy.monetabatoswebspring.services.mapper.SchoolMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;
    private final SchoolMapper schoolMapper;

    @Override
    public SchoolDTO save(SchoolDTO schoolDTO) {
        log.debug("Request to save School : {}", schoolDTO);
        School school = schoolMapper.toEntity(schoolDTO);
        school = schoolRepository.save(school);
        return schoolMapper.toDto(school);
    }

    @Override
    public SchoolDTO update(SchoolDTO schoolDTO) {
        log.debug("Request to update School : {}", schoolDTO);
        return findOne(schoolDTO.getId()).map(schoolExisting -> {
            schoolExisting.setName(schoolDTO.getName());
            schoolExisting.setUrlLogo(schoolDTO.getUrlLogo());
            return save(schoolExisting);
        }).orElseThrow(() -> new IllegalArgumentException());
    }

    @Override
    public Optional<SchoolDTO> findOne(Long id) {
        log.debug("Request to get School : {}", id);
        return schoolRepository.findById(id).map(school -> {
            return schoolMapper.toDto(school);
        });
    }

    @Override
    public List<SchoolDTO> findAll() {
        log.debug("Request to get all Schools");
        return schoolRepository.findAll().stream().map(school -> {
            return schoolMapper.toDto(school);
        }).toList();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete School : {}", id);
        schoolRepository.deleteById(id);
    }
}
